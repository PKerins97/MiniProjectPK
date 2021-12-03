public class RentACar extends CarRentalApp {
    private String dateFrom;
    private String dateTo;
    private String availability;

    public RentACar(String dateFrom, String dateTo, String availability) {
        setDateFrom(dateFrom);
        setDateTo(dateTo);
        setAvailability(availability);
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return String.format("Date From: %s \nDate To: %s", getDateFrom(),getDateTo());
    }
}
