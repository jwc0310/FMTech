import android.content.Context;
import android.graphics.RectF;

public final class bkq
  extends cun<mxt, mxu>
{
  private final String A;
  private final RectF B;
  private final long a;
  private final Long b;
  private final String c;
  private final String d;
  private final String e;
  private final String f;
  private final String g;
  private final String z;
  
  public bkq(Context paramContext, int paramInt, long paramLong, Long paramLong1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, RectF paramRectF)
  {
    super(paramContext, paramInt, "photoscreatetag", new mxt(), new mxu());
    int i;
    if (paramLong1 != null)
    {
      i = 1;
      if (paramRectF == null) {
        break label62;
      }
    }
    label62:
    for (int j = 1;; j = 0)
    {
      if ((j ^ i) != 0) {
        break label68;
      }
      throw new IllegalArgumentException("Only one of shapeId or relativeBounds should be supplied.");
      i = 0;
      break;
    }
    label68:
    this.a = paramLong;
    this.b = paramLong1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
    this.g = paramString5;
    this.z = paramString6;
    this.A = paramString7;
    this.B = paramRectF;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bkq
 * JD-Core Version:    0.7.0.1
 */