class Sugar extends Cookie {
  private String cookieShape;
  private boolean isDecorated;

  Sugar() {
    cookieShape = "";
    isDecorated = false;
  }

  Sugar(String theCookieShape) {
    cookieShape = theCookieShape;
    isDecorated = false;
  }

  String getCookieShape() {
    return cookieShape;
  }

  void setCookieShape(String theCookieShape) {
    cookieShape = theCookieShape;
  }

  void shapeCutOutCookies(String theCookieShape, int theNum) {
    System.out.println(theNum + " cookies were cut into " + theCookieShape);
    setNumber(theNum);
  }

  void decorateCookies() {
    if(super.getIsReady()) {
      isDecorated = true;
      System.out.println("The cookies were decorated");
    } 
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }
}