class Cookie {
  private int number;
  private int bakeTemp;
  private int bakeTime;
  private boolean isReady;

  Cookie() {
    number = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  Cookie(int theNum, int theBakeTemp, int theBakeTime) {
    number = theNum;
    bakeTemp = theBakeTemp;
    bakeTime = theBakeTime;
    isReady = false;
  }

  boolean getIsReady() {
    return isReady;
  }

  void setNumber(int theNum) {
    number = theNum;
  }

  void bakeCookies(int theBakeTemp, int theBakeTime) {
    System.out.println(number + " cookies were baked at " + theBakeTemp + " degree F for " + theBakeTime + " minutes");
    isReady = true;
  }
}