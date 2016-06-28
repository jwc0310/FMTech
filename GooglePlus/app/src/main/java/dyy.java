import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.util.Log;

public final class dyy
  extends eab
{
  private lxi V;
  private qdp a;
  private lxi b;
  
  public dyy(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dyy(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dyy(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.a = null;
    this.b = null;
    this.V = null;
  }
  
  protected final String F_()
  {
    if ((this.a != null) && (!TextUtils.isEmpty(this.a.b))) {
      return this.a.b;
    }
    return null;
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a == null) {
      return paramInt2;
    }
    int i = paramInt2 + (this.M.top + this.H.l);
    int j = paramInt3 - (this.M.left + this.M.right + 2 * this.H.m);
    int k = paramInt1 + this.M.left + this.H.m;
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i1;
    qeb localqeb;
    String str1;
    String str2;
    if (this.a.c != null)
    {
      i1 = 0;
      if (i1 < this.a.c.length)
      {
        localqeb = (qeb)this.a.c[i1].b(qeb.a);
        if (localqeb != null)
        {
          str1 = localqeb.b;
          str2 = localqeb.c;
          if ((localqeb.d == null) || (TextUtils.isEmpty(localqeb.d.a))) {
            break label442;
          }
        }
      }
    }
    label442:
    for (String str3 = localqeb.d.a;; str3 = str2)
    {
      if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str3)))
      {
        efj.a(localSpannableStringBuilder, str1, new TextAppearanceSpan(getContext(), efj.yj));
        localSpannableStringBuilder.append(" ");
        efj.a(localSpannableStringBuilder, str3, new TextAppearanceSpan(getContext(), efj.yk));
        if (i1 != -1 + this.a.c.length) {
          localSpannableStringBuilder.append("  ");
        }
      }
      i1++;
      break;
      int n;
      if (localSpannableStringBuilder.length() > 0)
      {
        n = i + this.H.aw;
        this.V = new lxi(localSpannableStringBuilder, efj.B(getContext(), efj.yo), j, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
        this.V.a(k, n);
      }
      for (int m = n + (this.V.getHeight() + this.H.av);; m = i)
      {
        if (!TextUtils.isEmpty(this.a.e))
        {
          this.b = new lxi(this.a.e, efj.B(getContext(), efj.yo), j, Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, false);
          this.b.a(k, m);
          m += this.b.getHeight();
        }
        return m;
      }
    }
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    if (this.V != null)
    {
      int k = this.V.a.left;
      int m = this.V.a.top;
      paramCanvas.translate(k, m);
      this.V.draw(paramCanvas);
      paramCanvas.translate(-k, -m);
      paramInt = this.V.a.bottom;
    }
    if (this.b != null)
    {
      int i = this.b.a.left;
      int j = this.b.a.top;
      paramCanvas.translate(i, j);
      this.b.draw(paramCanvas);
      paramCanvas.translate(-i, -j);
      paramInt = this.b.a.bottom;
    }
    return paramInt;
  }
  
  protected final void a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(26);
    try
    {
      this.a = ((qdp)qat.b(new qdp(), arrayOfByte, 0, arrayOfByte.length));
      return;
    }
    catch (qas localqas)
    {
      Log.e("PlaceReviewCardGroup", "Failed to parse the PlaceReview", localqas);
    }
  }
  
  protected final String h()
  {
    if ((this.a != null) && (!TextUtils.isEmpty(this.a.b)))
    {
      Resources localResources = getResources();
      int i = aau.js;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a.b;
      return localResources.getString(i, arrayOfObject);
    }
    return null;
  }
  
  protected final void i()
  {
    if ((this.o != null) && (this.a != null) && (this.a.d != null))
    {
      qdq localqdq = (qdq)this.a.d.b(qdq.a);
      if ((localqdq != null) && (!TextUtils.isEmpty(localqdq.g)))
      {
        dge localdge = this.o;
        String str = localqdq.g;
        if (!TextUtils.isEmpty(str))
        {
          Intent localIntent = efj.a(localdge.b, localdge.a, str, null, false);
          localdge.b.startActivity(localIntent);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dyy
 * JD-Core Version:    0.7.0.1
 */