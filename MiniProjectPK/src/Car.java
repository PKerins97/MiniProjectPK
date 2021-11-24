public class Car {

    private String category;
    private String carMake;
    private String carModel;
    private String regNum;
    private double price;

    public Car(String category, String carMake, String carModel, String regNum, double price) {
        setCategory(category);
        setCarMake(carMake);
        setCarModel(carModel);
        setRegNum(regNum);
        setPrice(price);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Category: %s \nMake: %s \nModel: %s, Reg Number: %s \nPrice: %2f", getCategory(),getCarMake(),getCarModel(),getRegNum(),getPrice());
    }
}

