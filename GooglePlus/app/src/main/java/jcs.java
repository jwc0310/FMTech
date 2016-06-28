import android.content.Context;
import android.util.Pair;
import java.util.Arrays;

public final class jcs
{
  private static final String b = jdr.a(jcs.class);
  public final Context a;
  
  public jcs(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static Pair<jal, qre> a(int paramInt, String[] paramArrayOfString, jdl paramjdl)
  {
    if (paramjdl.n())
    {
      String str3 = b;
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      arrayOfObject3[1] = Arrays.toString(paramArrayOfString);
      jdr.c(str3, String.format("Failed to fetch notifications by key for accountId [%d], keys [%s]", arrayOfObject3));
      if (kbw.b(paramjdl.q)) {}
      for (jam localjam = jam.b;; localjam = jam.c) {
        return Pair.create(new jal(localjam, paramjdl.q), null);
      }
    }
    qat localqat;
    mvq localmvq;
    if (paramjdl.x)
    {
      localqat = paramjdl.w;
      localmvq = (mvq)localqat;
      if (localmvq == null) {
        break label181;
      }
    }
    label181:
    for (qre localqre = localmvq.a;; localqre = null)
    {
      if (localqre != null) {
        break label187;
      }
      String str2 = b;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      arrayOfObject2[1] = Arrays.toString(paramArrayOfString);
      jdr.c(str2, String.format("Got empty response for fetch by key - accountId [%d], keys [%s]", arrayOfObject2));
      return Pair.create(new jal(jam.b), null);
      localqat = null;
      break;
    }
    label187:
    jdr.a(b, localqre.toString());
    String str1 = b;
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Arrays.toString(paramArrayOfString);
    arrayOfObject1[2] = Integer.valueOf(localqre.a.length);
    jdr.a(str1, String.format("Completed fetch notifications by key for accountId [%d], keys [%s] and received [%d] notifications.", arrayOfObject1));
    return Pair.create(new jal(jam.a), localqre);
  }
  
  public static qrd a(Context paramContext, String[] paramArrayOfString)
  {
    jdp localjdp = jdp.a(paramContext);
    qrd localqrd = new qrd();
    localqrd.a = localjdp.b();
    localqrd.b = new jdo(paramContext).a();
    localqrd.c = paramArrayOfString;
    return localqrd;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcs
 * JD-Core Version:    0.7.0.1
 */