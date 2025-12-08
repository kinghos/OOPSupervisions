package ExamQs;

public class ImmutableAssetLocation {
    private String asset;
    private int id;
    private double latitude;
    private double longitude;
    private boolean isImmutable;

    public class OutOfRange extends Exception {};

    public ImmutableAssetLocation(String asset, int id, double latitude, double longitude, boolean isImmutable) {
        this.asset = asset;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isImmutable = isImmutable;
    }

    public String getAsset() {
        return asset;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setAsset(String mAsset) throws IllegalAccessException{
        if (!isImmutable) {
            asset = mAsset;
        } else {
            throw new IllegalAccessException();
        }
    }

    public void setId(int mId) {
        id = mId;
    }

    public void setLatitude(double mLatitude) throws OutOfRange {
        if (mLatitude <= -90 || mLatitude >= 90) {
            throw new OutOfRange();
        }
        latitude = mLatitude;
    }

    public void setLongitude(double mLongitude) throws OutOfRange {
        if (mLongitude <= -180 || mLongitude >= 180) {
            throw new OutOfRange();
        }
        longitude = mLongitude;
    }


}
