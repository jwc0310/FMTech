import java.io.DataOutputStream;
import java.util.ArrayList;

public final class lmk
  extends mab
  implements hex
{
  ArrayList<hev> a;
  
  lmk() {}
  
  public lmk(ood[] paramArrayOfood)
  {
    this.a = new ArrayList(paramArrayOfood.length);
    for (int i = 0; i < paramArrayOfood.length; i++)
    {
      ood localood = paramArrayOfood[i];
      this.a.add(new lmi(localood.b, localood.a, null, localood.c, false, localood.d));
    }
  }
  
  public static void a(lmk paramlmk, DataOutputStream paramDataOutputStream)
  {
    int i = paramlmk.a.size();
    paramDataOutputStream.writeInt(i);
    for (int j = 0; j < i; j++)
    {
      hev localhev = (hev)paramlmk.a.get(j);
      if ((localhev instanceof lmi)) {
        lmi.a((lmi)localhev, paramDataOutputStream);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lmk
 * JD-Core Version:    0.7.0.1
 */