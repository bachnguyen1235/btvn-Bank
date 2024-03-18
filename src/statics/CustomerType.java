package statics;

public enum CustomerType {
    PERSONAL("Ca nhan"),
    GROUP("Tap the"),
    ENTERPRISE("Doanh nghiep");

  public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
