package ExamQs;

public class AssetLocation {
    private String asset;
    private int id;
    private double latitude;
    private double longitude;

    public class OutOfRange extends Exception {};

    public AssetLocation(String asset, int id, double latitude, double longitude) {
        this.asset = asset;
        this.id = id;
        // [James] You do not apply your error checking on object instantiation
        // The solution is to use call your setter methods from the constructor
        this.latitude = latitude;
        this.longitude = longitude;
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

    public void setAsset(String mAsset) {
        asset = mAsset;
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
            // A useful error message in the exception would be helpful to say what the valid range is
            throw new OutOfRange();
        }
        longitude = mLongitude;
    }

}