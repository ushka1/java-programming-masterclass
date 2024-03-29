package V1_Composition;

public class PC {
  private Casing casing;
  private Monitor monitor;
  private Motherboard motherboard;

  public PC(Casing casing, Monitor monitor, Motherboard motherboard) {
    this.casing = casing;
    this.monitor = monitor;
    this.motherboard = motherboard;
  }

  private void drawLogo() {
    monitor.drawPixelAt(400, 400, "yellow");
  }

  public void powerUp() {
    casing.pressPowerButton();
    drawLogo();
  }

  public void loadProgram(String programName) {
    motherboard.loadProgram(programName);
  }
}
