import android.content.Context;

public final class gct
{
  public static final String a = gcl.class.getName();
  public static final String b = gcn.class.getName();
  public static final String c = gcm.class.getName();
  private static gcs d;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new gcs();
    }
    parammbb.a(gcl.class, new gco(paramContext, (byte)0));
  }
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new gcs();
    }
    parammbb.a(gcn.class, new gcr());
  }
  
  public static void b(mbb parammbb)
  {
    if (d == null) {
      d = new gcs();
    }
    parammbb.a(gcm.class, new gcq());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gct
 * JD-Core Version:    0.7.0.1
 */