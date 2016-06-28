import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;

public final class dwh
  extends eab
{
  private dwg a = new dwg(getContext());
  private qdt b;
  
  public dwh(Context paramContext)
  {
    this(paramContext, null);
  }
  
  private dwh(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, null, 0);
  }
  
  private dwh(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, 0);
    this.a.setOnClickListener(this);
  }
  
  protected final boolean C_()
  {
    return true;
  }
  
  public final void D_()
  {
    super.D_();
    this.a.a();
  }
  
  protected final int a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.B = paramInt1;
    this.C = paramInt2;
    int i = View.MeasureSpec.makeMeasureSpec(paramInt3, 1073741824);
    int j = View.MeasureSpec.makeMeasureSpec(0, 0);
    this.a.measure(i, j);
    return paramInt2 + this.a.getMeasuredHeight();
  }
  
  protected final int a(Canvas paramCanvas, int paramInt)
  {
    return paramInt + this.a.getHeight();
  }
  
  protected final void a(Cursor paramCursor)
  {
    byte[] arrayOfByte = paramCursor.getBlob(26);
    try
    {
      this.b = ((qdt)qat.b(new qdt(), arrayOfByte, 0, arrayOfByte.length));
      return;
    }
    catch (qas localqas)
    {
      Log.e("EventCardViewGroup", "Could not deserialize PlusEventV2 from Blob.", localqas);
    }
  }
  
  protected final void a(StringBuilder paramStringBuilder)
  {
    this.a.a(paramStringBuilder);
  }
  
  public final boolean a(int paramInt)
  {
    if ((paramInt == aaw.f) && (this.b != null) && (this.b.g != null) && (this.b.d != null))
    {
      this.o.b(this.b.g, this.b.d);
      return true;
    }
    return super.a(paramInt);
  }
  
  protected final void a_(Cursor paramCursor, hfa paramhfa, int paramInt)
  {
    removeView(this.a);
    this.a.a(this, this.b);
    addView(this.a);
  }
  
  public final Intent b(boolean paramBoolean)
  {
    Intent localIntent;
    if (TextUtils.isEmpty(this.k))
    {
      int i = q();
      Context localContext = getContext().getApplicationContext();
      String str1 = this.b.g;
      String str2 = this.b.d;
      byte[] arrayOfByte = this.z;
      localIntent = efj.a(localContext, i, str1, str2, 0, null, -2147483648, null, false, 1);
      localIntent.putExtra("promoted_post_data", arrayOfByte);
    }
    do
    {
      return localIntent;
      localIntent = super.b(paramBoolean);
    } while (localIntent == null);
    localIntent.putExtra("event_id", this.b.g);
    localIntent.putExtra("owner_id", this.b.d);
    return localIntent;
  }
  
  public final la<Integer, String> g()
  {
    la localla = super.g();
    if (this.b != null)
    {
      String str1 = this.b.b;
      if (!TextUtils.isEmpty(str1))
      {
        Resources localResources = getResources();
        int i = aau.aJ;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = jr.a().a(str1);
        String str2 = localResources.getString(i, arrayOfObject);
        localla.put(Integer.valueOf(aaw.f), str2);
      }
    }
    return localla;
  }
  
  public final void onClick(View paramView)
  {
    if ((efj.B(getContext())) && (this.R == 0))
    {
      ((gil)mbb.a(getContext(), gil.class)).b(this);
      return;
    }
    if (paramView == this.a)
    {
      this.o.b(this.b.g, this.b.d);
      return;
    }
    super.onClick(paramView);
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.a.layout(this.B, this.C, this.B + this.a.getMeasuredWidth(), this.C + this.a.getMeasuredHeight());
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dwh
 * JD-Core Version:    0.7.0.1
 */