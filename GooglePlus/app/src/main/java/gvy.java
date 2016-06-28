public enum gvy
{
  public static la<String, gvy> g;
  public final String h;
  
  static
  {
    int j = 0;
    a = new gvy("QUEUED", 0, "Queued");
    b = new gvy("IN_PROGRESS", 1, "InProgress");
    c = new gvy("COMPLETE", 2, "Complete");
    d = new gvy("ERROR", 3, "Error");
    e = new gvy("FAILED", 4, "Failed");
    f = new gvy("CANCELLED", 5, "Cancelled");
    gvy[] arrayOfgvy1 = new gvy[6];
    arrayOfgvy1[0] = a;
    arrayOfgvy1[1] = b;
    arrayOfgvy1[2] = c;
    arrayOfgvy1[3] = d;
    arrayOfgvy1[4] = e;
    arrayOfgvy1[5] = f;
    i = arrayOfgvy1;
    g = new la();
    gvy[] arrayOfgvy2 = values();
    int k = arrayOfgvy2.length;
    while (j < k)
    {
      gvy localgvy = arrayOfgvy2[j];
      g.put(localgvy.h, localgvy);
      j++;
    }
  }
  
  private gvy(String paramString)
  {
    this.h = paramString;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvy
 * JD-Core Version:    0.7.0.1
 */