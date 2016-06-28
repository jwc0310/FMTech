import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

public final class kzp
  extends hqj
{
  public final SQLiteQueryBuilder r = new SQLiteQueryBuilder();
  private final kzr s;
  private final int t;
  private int u;
  
  public kzp(Context paramContext, int paramInt, String[] paramArrayOfString)
  {
    super(paramContext, ((kyx)mbb.a(paramContext, kyx.class)).a());
    this.s = ((kzr)mbb.a(paramContext, kzr.class));
    this.t = paramInt;
    this.e = paramArrayOfString;
    this.r.setTables("squares");
    this.r.setProjectionMap(kzq.a);
    this.r.appendWhere("1=1");
    this.h = "square_name COLLATE LOCALIZED";
  }
  
  public final kzp a(int paramInt)
  {
    this.u = paramInt;
    this.r.appendWhere(" AND (");
    if ((paramInt & 0x1) > 0) {
      this.r.appendWhere("is_member!=0 OR ");
    }
    if ((paramInt & 0x2) > 0) {
      this.r.appendWhere("membership_status=5 OR ");
    }
    if ((paramInt & 0x4) > 0) {
      this.r.appendWhere("(membership_status=1 OR membership_status=2) OR ");
    }
    if ((paramInt & 0x8) > 0) {
      this.r.appendWhere("membership_status=5 OR list_category=3 OR ");
    }
    if ((paramInt & 0x10) > 0) {
      this.r.appendWhere("(is_member!=0 AND membership_status=3) OR ");
    }
    if ((paramInt & 0x20) > 0) {
      this.r.appendWhere("list_category=3 OR ");
    }
    this.r.appendWhere("0=1)");
    return this;
  }
  
  public final kzp b(int paramInt)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = this.r;
    String str = String.valueOf(" AND post_visibility=");
    localSQLiteQueryBuilder.appendWhere(11 + String.valueOf(str).length() + str + 1);
    return this;
  }
  
  public final Cursor o()
  {
    boolean bool1 = true;
    Context localContext = this.l;
    boolean bool2;
    if ((0x28 & this.u) > 0)
    {
      bool2 = bool1;
      if ((this.s.a(this.t)) || ((bool2) && (this.s.b(this.t))))
      {
        kzj localkzj = new kzj(localContext, this.t, bool2);
        localkzj.a = bool1;
        if (gzj.b(localContext, localkzj).b == 200) {
          break label136;
        }
      }
    }
    for (;;)
    {
      if (bool1) {
        Log.e("SquareLoader", "Failed To sync Square list. Returning cached data.");
      }
      SQLiteDatabase localSQLiteDatabase = hsb.b(localContext, this.t);
      return this.r.query(localSQLiteDatabase, this.e, null, null, null, null, this.h);
      bool2 = false;
      break;
      label136:
      bool1 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzp
 * JD-Core Version:    0.7.0.1
 */