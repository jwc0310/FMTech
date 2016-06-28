import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;

public final class dez
  extends hqj
{
  private final int r;
  private final String s;
  
  public dez(Context paramContext, int paramInt, String paramString)
  {
    super(paramContext);
    this.r = paramInt;
    this.s = paramString;
  }
  
  public final Cursor o()
  {
    int i = this.r;
    bjl localbjl = new bjl(this.l, i, this.s, 200);
    localbjl.i();
    if (localbjl.n()) {
      localbjl.c("PlusOnePeopleLoader");
    }
    okr[] arrayOfokr;
    do
    {
      return null;
      arrayOfokr = localbjl.a;
    } while (arrayOfokr == null);
    MatrixCursor localMatrixCursor = new MatrixCursor(clz.a, arrayOfokr.length);
    int j = arrayOfokr.length;
    int k = 0;
    int m = 0;
    if (k < j)
    {
      okr localokr = arrayOfokr[k];
      Object[] arrayOfObject = new Object[5];
      int n = m + 1;
      arrayOfObject[0] = Integer.valueOf(m);
      String str1 = String.valueOf(localokr.a);
      if (str1.length() != 0) {}
      for (String str2 = "g:".concat(str1);; str2 = new String("g:"))
      {
        arrayOfObject[1] = str2;
        arrayOfObject[2] = localokr.a;
        arrayOfObject[3] = localokr.c;
        arrayOfObject[4] = localokr.b;
        localMatrixCursor.addRow(arrayOfObject);
        k++;
        m = n;
        break;
      }
    }
    return localMatrixCursor;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dez
 * JD-Core Version:    0.7.0.1
 */