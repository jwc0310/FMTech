import android.content.Context;
import android.util.SparseArray;
import java.util.List;

public final class dnt
  extends dob
{
  private CharSequence[] B;
  private CharSequence[] C;
  private CharSequence[] D;
  dnu a;
  
  public dnt(Context paramContext, List<Integer> paramList, SparseArray<dpi> paramSparseArray)
  {
    super(paramContext);
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    this.B = new CharSequence[paramList.size()];
    this.C = new CharSequence[paramList.size()];
    this.D = new CharSequence[paramList.size()];
    int i = ((hba)mbb.a(paramContext, hba.class)).d();
    int j = aau.cr;
    b(this.l.getString(j));
    int k = paramList.size();
    int m = 0;
    if (m < k)
    {
      int n = ((Integer)paramList.get(m)).intValue();
      gjb localgjb = localgiz.a(n);
      String str1 = localgjb.b("account_name");
      this.B[m] = localgjb.b("display_name");
      this.D[m] = String.valueOf(n);
      dpi localdpi;
      int i1;
      label216:
      String str3;
      if ((paramSparseArray != null) && (paramSparseArray.indexOfKey(n) >= 0))
      {
        localdpi = (dpi)paramSparseArray.get(n);
        if ((localdpi.b != -1) && (localdpi.a != -1))
        {
          i1 = 1;
          if (!localdpi.c) {
            break label312;
          }
          str3 = paramContext.getString(aau.mI, new Object[] { str1 });
          label242:
          this.C[m] = str3;
        }
      }
      for (;;)
      {
        if (i == n)
        {
          b(this.B[m]);
          a_(this.C[m]);
          String str2 = String.valueOf(n);
          this.e = str2;
          e(str2);
        }
        m++;
        break;
        i1 = 0;
        break label216;
        label312:
        if (i1 != 0)
        {
          int i2 = aau.mG;
          Object[] arrayOfObject = new Object[2];
          arrayOfObject[0] = str1;
          arrayOfObject[1] = hcw.b(paramContext, localdpi.b - localdpi.a);
          str3 = paramContext.getString(i2, arrayOfObject);
          break label242;
        }
        str3 = paramContext.getString(aau.mH, new Object[] { str1 });
        break label242;
        this.C[m] = str1;
      }
    }
    this.b = this.B;
    this.c = this.D;
    this.d = this.C;
  }
  
  protected final void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (this.a != null) {
      this.a.a(paramBoolean);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dnt
 * JD-Core Version:    0.7.0.1
 */