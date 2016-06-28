import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

public final class cvc
  implements jtk
{
  private Context a;
  
  public cvc(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, mlu parammlu)
  {
    if ((parammlu.f == null) || (parammlu.f.a == null) || (TextUtils.isEmpty(parammlu.f.a.a)) || (TextUtils.isEmpty(parammlu.f.a.b))) {
      return null;
    }
    mlj localmlj = parammlu.f.a;
    ArrayList localArrayList = new ArrayList();
    if (localmlj.c != null) {
      for (mmr localmmr : localmlj.c) {
        if (!TextUtils.isEmpty(localmmr.a)) {
          localArrayList.add(localmmr.a);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    String[] arrayOfString = (String[])localArrayList.toArray(new String[localArrayList.size()]);
    String str = jrf.a(3, new String[] { jrf.a(null, localmlj.b, localmlj.a, "ALBUM") });
    bdo localbdo = new bdo(this.a, paramInt);
    localbdo.e = str;
    localbdo.u = arrayOfString;
    return localbdo.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvc
 * JD-Core Version:    0.7.0.1
 */