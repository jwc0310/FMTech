import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.social.ui.views.columngridview.ColumnGridView;
import java.util.List;

public final class dap
  extends hqi
{
  private View.OnClickListener f;
  private lxx g;
  private boolean h;
  private boolean i;
  
  public dap(Context paramContext, int paramInt, Cursor paramCursor, View.OnClickListener paramOnClickListener, lxx paramlxx, ColumnGridView paramColumnGridView, boolean paramBoolean)
  {
    super(paramContext, null);
    this.f = paramOnClickListener;
    this.g = paramlxx;
    this.i = paramBoolean;
    this.h = true;
    paramColumnGridView.a = false;
    paramColumnGridView.a(efj.x(paramContext));
    int j = (int)paramContext.getResources().getDimension(ehr.ef);
    paramColumnGridView.b(j);
    if (this.i) {}
    for (int k = -j / 2;; k = 0)
    {
      paramColumnGridView.setPadding(j, k, j, 0);
      daq localdaq = new daq(this);
      paramColumnGridView.e.c = localdaq;
      return;
    }
  }
  
  public final View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    switch (paramCursor.getInt(1))
    {
    default: 
      return null;
    case 0: 
      TextView localTextView = new TextView(paramContext);
      ((TextView)localTextView).setTextAppearance(paramContext, efj.yE);
      lyc locallyc2 = new lyc(2, -3, ((ColumnGridView)paramViewGroup).b, 1);
      locallyc2.height = -2;
      localTextView.setLayoutParams(locallyc2);
      return localTextView;
    }
    dwi localdwi = new dwi(paramContext);
    lyc locallyc1 = new lyc(2, -3, 1, 1);
    if (this.h) {
      locallyc1.height = -2;
    }
    localdwi.setLayoutParams(locallyc1);
    return localdwi;
  }
  
  public final void a(View paramView, Context paramContext, Cursor paramCursor)
  {
    int j = 1;
    if (paramCursor.getPosition() < getCount()) {}
    switch (paramCursor.getInt(j))
    {
    default: 
      return;
    case 0: 
      TextView localTextView = (TextView)paramView;
      if (paramCursor.getInt(2) == 2) {}
      for (int m = aau.ha;; m = aau.gZ)
      {
        localTextView.setText(m);
        return;
      }
    }
    dwi localdwi = (dwi)paramView;
    int k;
    String str1;
    String str2;
    dwf localdwf;
    if (paramCursor.getInt(5) != 0)
    {
      k = j;
      hxj localhxj = bqo.a(paramCursor, 3, 4);
      View.OnClickListener localOnClickListener = this.f;
      localdwi.g = localOnClickListener;
      str1 = paramCursor.getString(6);
      str2 = hdo.b(paramCursor.getString(7));
      localdwi.k = localhxj;
      localdwf = localdwi.j;
      localdwf.ap_();
      localdwf.a();
      localdwf.A = localhxj;
      localdwf.C = k;
      if (localdwf.A == null) {
        break label366;
      }
    }
    for (;;)
    {
      localdwf.z = j;
      if (localdwf.z)
      {
        localdwf.D = localdwi;
        localdwf.B = bqo.a(localdwf.A.f().d);
        if (localdwf.B != null) {
          localdwf.E = ipf.a(localdwi.getContext(), localdwf.B.c, ipm.a);
        }
        localdwf.H = new dvq(localdwf.D, str1, str2, null, 2);
        localdwf.Z = null;
        dvl localdvl = localdwf.D;
        dvq localdvq = localdwf.H;
        if (localdvq != null)
        {
          localdvl.f.remove(localdvq);
          localdvl.f.add(localdvq);
        }
      }
      localdwf.b();
      localdwi.requestLayout();
      return;
      k = 0;
      break;
      label366:
      j = 0;
    }
  }
  
  public final int getCount()
  {
    if (this.i) {
      return 1 + super.getCount();
    }
    return super.getCount();
  }
  
  public final int getItemViewType(int paramInt)
  {
    if (this.i)
    {
      if (paramInt == 0) {
        return -1;
      }
      paramInt--;
    }
    Cursor localCursor = (Cursor)getItem(paramInt);
    if (localCursor == null) {
      return -1;
    }
    switch (localCursor.getInt(1))
    {
    default: 
      return super.getItemViewType(paramInt);
    case 0: 
      return 0;
    }
    return 1;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.i)
    {
      if (paramInt == 0)
      {
        View localView = new View(this.d);
        lyc locallyc = new lyc(2, -3, ((ColumnGridView)paramViewGroup).b, 1);
        locallyc.height = efj.y(this.d);
        localView.setLayoutParams(locallyc);
        return localView;
      }
      paramInt--;
    }
    return super.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 2;
  }
  
  public final boolean hasStableIds()
  {
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dap
 * JD-Core Version:    0.7.0.1
 */