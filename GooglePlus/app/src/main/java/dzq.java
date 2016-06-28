import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public final class dzq
  extends ViewGroup
  implements View.OnClickListener, lxj
{
  qdj a;
  dzp b;
  dwy c;
  gik d;
  private loj e;
  
  public dzq(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = loj.a(paramContext);
    this.b = new dzp(paramContext);
    this.c = new dwy(paramContext, paramAttributeSet, paramInt);
    this.c.setOnClickListener(this);
  }
  
  public final void D_()
  {
    this.b.D_();
    this.c.D_();
    this.d = null;
    removeAllViews();
  }
  
  final qdc b()
  {
    if (this.a.n != null) {
      return (qdc)this.a.n.b(qdc.a);
    }
    return null;
  }
  
  public final void onClick(View paramView)
  {
    Context localContext = getContext();
    int i = ((git)mbb.a(getContext(), git.class)).c();
    if ((efj.B(getContext())) && (this.d != null) && (this.d.f()))
    {
      this.d.E_();
      return;
    }
    String str1 = this.a.g;
    String str2 = this.a.d;
    if (!((hyi)mbb.a(localContext, hyi.class)).b(bwb.t, i)) {}
    Intent localIntent;
    for (Object localObject = efj.a(localContext, i, str1, str2, 0, null, -2147483648, null, false, 1);; localObject = localIntent)
    {
      localContext.startActivity((Intent)localObject);
      return;
      localIntent = new Intent("com.google.android.libraries.social.showtimerefresh.VIEW_HOA_EVENT_DETAILS");
      localIntent.setPackage(localContext.getPackageName());
      localIntent.putExtra("event_id", str1);
      localIntent.putExtra("account_id", i);
      localIntent.putExtra("owner_id", str2);
      localIntent.putExtra("invitation_token", null);
      localIntent.putExtra("auth_key", null);
      localIntent.putExtra("notif_type", 0);
      localIntent.putExtra("com.google.android.libraries.social.notifications.notif_id", null);
      localIntent.putExtra("rsvp", -2147483648);
      localIntent.addFlags(67108864);
    }
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null)
    {
      this.c.layout(0, this.e.m, this.c.getMeasuredWidth(), this.e.m + this.c.getMeasuredHeight());
      int i = this.e.m + this.c.getMeasuredHeight();
      this.b.layout(0, i, this.b.getMeasuredWidth(), i + this.b.getMeasuredHeight());
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    qdj localqdj = this.a;
    int j = 0;
    if (localqdj != null)
    {
      this.c.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
      this.b.measure(View.MeasureSpec.makeMeasureSpec(i, -2147483648), View.MeasureSpec.makeMeasureSpec(0, -2147483648));
      j = this.e.m + this.b.getMeasuredHeight() + this.c.getMeasuredHeight();
    }
    setMeasuredDimension(i, j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dzq
 * JD-Core Version:    0.7.0.1
 */