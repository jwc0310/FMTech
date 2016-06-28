public enum mfr
{
  public long d;
  
  static
  {
    a = new mft("GIGABYTES", 1, 1073741824L);
    b = new mfu("MEGABYTES", 2, 1048576L);
    c = new mfv("KILOBYTES", 3, 1024L);
    f = new mfw("BYTES", 4, 1L);
    mfr[] arrayOfmfr = new mfr[5];
    arrayOfmfr[0] = e;
    arrayOfmfr[1] = a;
    arrayOfmfr[2] = b;
    arrayOfmfr[3] = c;
    arrayOfmfr[4] = f;
    g = arrayOfmfr;
  }
  
  private mfr(long paramLong)
  {
    this.d = paramLong;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfr
 * JD-Core Version:    0.7.0.1
 */