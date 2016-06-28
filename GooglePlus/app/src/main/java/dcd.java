import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.plus.views.AutoAwesomeMovieTileView;
import com.google.android.apps.plus.views.NewAutoAwesomeMovieTileView;
import com.google.android.libraries.social.media.ui.MediaView;

public final class dcd
  extends hqf
{
  public final boolean a;
  public hqr b;
  public View.OnClickListener c;
  private final LayoutInflater d;
  private final int e;
  private final int f;
  
  public dcd(Context paramContext)
  {
    super(paramContext, (byte)0);
    for (int i = 0; i < 3; i++)
    {
      hqg localhqg = new hqg(false, false);
      if (this.aO >= this.aN.length)
      {
        hqg[] arrayOfhqg2 = new hqg[2 + this.aO];
        System.arraycopy(this.aN, 0, arrayOfhqg2, 0, this.aO);
        this.aN = arrayOfhqg2;
      }
      hqg[] arrayOfhqg1 = this.aN;
      int j = this.aO;
      this.aO = (j + 1);
      arrayOfhqg1[j] = localhqg;
      this.aP = false;
      notifyDataSetChanged();
    }
    this.f = new jrh(paramContext).a;
    this.e = aau.cj;
    this.d = LayoutInflater.from(paramContext);
    this.a = true;
    hqr localhqr = new hqr(new String[0]);
    localhqr.a(new Object[0]);
    a(0, localhqr);
  }
  
  protected final int a(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return -1;
    case 0: 
      return 2;
    case 1: 
      return 0;
    }
    return 1;
  }
  
  protected final View a(Context paramContext, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return null;
    case 0: 
      return LayoutInflater.from(paramContext).inflate(efj.uM, paramViewGroup, false);
    case 1: 
      LinearLayout localLinearLayout = (LinearLayout)this.d.inflate(efj.tj, paramViewGroup, false);
      localLinearLayout.findViewById(aaw.jO).setVisibility(8);
      localLinearLayout.findViewById(aaw.hs).setVisibility(8);
      localLinearLayout.setLayoutParams(new lyc(2, -2, this.f, 1));
      return localLinearLayout;
    }
    return LayoutInflater.from(paramContext).inflate(efj.sL, paramViewGroup, false);
  }
  
  protected final void a(View paramView, int paramInt1, Cursor paramCursor, int paramInt2, ViewGroup paramViewGroup)
  {
    switch (paramInt1)
    {
    default: 
      return;
    case 0: 
      NewAutoAwesomeMovieTileView localNewAutoAwesomeMovieTileView = (NewAutoAwesomeMovieTileView)paramView;
      localNewAutoAwesomeMovieTileView.setLayoutParams(new lyc(2, -3, this.f, 1));
      String str5 = this.aM.getString(aau.lr);
      localNewAutoAwesomeMovieTileView.a.setText(str5);
      localNewAutoAwesomeMovieTileView.setOnClickListener(this.c);
      return;
    case 1: 
      ((TextView)paramView.findViewById(aaw.bA)).setText(this.e);
      return;
    }
    AutoAwesomeMovieTileView localAutoAwesomeMovieTileView = (AutoAwesomeMovieTileView)paramView;
    String str1 = paramCursor.getString(3);
    long l = paramCursor.getLong(9);
    String str2 = paramCursor.getString(1);
    String str3 = paramCursor.getString(5);
    ipm localipm = jrf.a(l);
    ipf localipf = ipf.a(this.aM, str2, str3, localipm);
    String str4 = paramCursor.getString(2);
    localAutoAwesomeMovieTileView.setTag(aaw.kX, str4);
    localAutoAwesomeMovieTileView.a.setText(str1);
    localAutoAwesomeMovieTileView.b.a(localipf);
    localAutoAwesomeMovieTileView.setOnClickListener(this.c);
    localAutoAwesomeMovieTileView.setTag(aaw.la, Long.valueOf(l));
    localAutoAwesomeMovieTileView.setLayoutParams(new lyc(2, -3, this.f, 1));
  }
  
  public final int e_(int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case 0: 
    case 1: 
      do
      {
        return 0;
        return 1;
      } while (this.b == null);
      return this.b.getCount();
    }
    return super.e_(paramInt);
  }
  
  public final int getViewTypeCount()
  {
    return 3;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dcd
 * JD-Core Version:    0.7.0.1
 */