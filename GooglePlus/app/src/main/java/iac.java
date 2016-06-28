import java.io.File;

final class iac
  implements Comparable<iac>
{
  File a;
  long b;
  long c;
  boolean d;
  
  public iac(File paramFile)
  {
    this.a = paramFile;
    this.b = paramFile.lastModified();
    this.c = paramFile.length();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iac
 * JD-Core Version:    0.7.0.1
 */