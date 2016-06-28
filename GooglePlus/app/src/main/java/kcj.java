import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class kcj
{
  public static final String a = kbu.class.getName();
  public static final String b = kbv.class.getName();
  public static final String c = mcn.class.getName();
  private static kci d;
  
  public static void a(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new kci();
    }
    parammbb.a(kbu.class, new kbr(paramContext));
  }
  
  public static void a(mbb parammbb)
  {
    if (d == null) {
      d = new kci();
    }
    parammbb.a(mcn.class, new mcn[0]);
  }
  
  public static void b(Context paramContext, mbb parammbb)
  {
    if (d == null) {
      d = new kci();
    }
    ArrayList localArrayList = new ArrayList(2);
    ixr localixr = (ixr)mbb.b(paramContext, ixr.class);
    if (localixr != null) {
      localArrayList.add(new kcd(localixr));
    }
    parammbb.a(kbv.class, (kbv[])localArrayList.toArray(new kbv[localArrayList.size()]));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcj
 * JD-Core Version:    0.7.0.1
 */