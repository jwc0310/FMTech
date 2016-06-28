import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.plus.service.DreamSettingsActivity;
import com.google.android.apps.plus.service.EsDreamService;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class dku
  extends BaseAdapter
{
  final Context a;
  Set<String> b = new HashSet();
  Cursor c;
  Cursor d;
  private final LayoutInflater f;
  private Cursor g;
  
  public dku(DreamSettingsActivity paramDreamSettingsActivity, Context paramContext)
  {
    this.a = paramContext;
    this.f = LayoutInflater.from(paramContext);
    this.b = EsDreamService.b(this.a, EsDreamService.a(paramDreamSettingsActivity));
  }
  
  public final void a(Cursor paramCursor1, Cursor paramCursor2)
  {
    DreamSettingsActivity localDreamSettingsActivity = this.e;
    Cursor localCursor = DreamSettingsActivity.a(localDreamSettingsActivity, aau.fq);
    MatrixCursor localMatrixCursor = new MatrixCursor(DreamSettingsActivity.f);
    Iterator localIterator = localDreamSettingsActivity.h.a(new String[] { "logged_in" }).iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      gjb localgjb = localDreamSettingsActivity.h.a(i);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(2);
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = localgjb.b("display_name");
      localMatrixCursor.addRow(arrayOfObject);
    }
    MergeCursor localMergeCursor = new MergeCursor(new Cursor[] { localCursor, localMatrixCursor });
    label176:
    Cursor[] arrayOfCursor3;
    if (paramCursor1 != null)
    {
      this.c = paramCursor1;
      if (paramCursor2 == null) {
        break label283;
      }
      this.d = paramCursor2;
      if (EsDreamService.a(this.a) == -1) {
        break label333;
      }
      arrayOfCursor3 = new Cursor[3];
      arrayOfCursor3[0] = localMergeCursor;
      arrayOfCursor3[1] = this.c;
      arrayOfCursor3[2] = this.d;
    }
    label283:
    label333:
    for (this.g = new MergeCursor(arrayOfCursor3);; this.g = localMergeCursor)
    {
      notifyDataSetChanged();
      return;
      if (this.c != null) {
        break;
      }
      Cursor[] arrayOfCursor1 = new Cursor[2];
      arrayOfCursor1[0] = DreamSettingsActivity.a(this.a, aau.ft);
      arrayOfCursor1[1] = DreamSettingsActivity.g();
      this.c = new MergeCursor(arrayOfCursor1);
      break;
      if (this.d != null) {
        break label176;
      }
      Cursor[] arrayOfCursor2 = new Cursor[2];
      arrayOfCursor2[0] = DreamSettingsActivity.a(this.a, aau.iH);
      arrayOfCursor2[1] = DreamSettingsActivity.g();
      this.d = new MergeCursor(arrayOfCursor2);
      break label176;
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public final int getCount()
  {
    if (this.g != null) {
      return this.g.getCount();
    }
    return 0;
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    this.g.moveToPosition(paramInt);
    return this.g.getInt(0);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    this.g.moveToPosition(paramInt);
    int i = getItemViewType(paramInt);
    View localView;
    if (paramView == null)
    {
      if (i == 0)
      {
        localView = this.f.inflate(efj.tp, paramViewGroup, false);
        paramView = localView;
      }
    }
    else
    {
      if (i != 0) {
        break label249;
      }
      String str3 = this.g.getString(2);
      String str4 = this.g.getString(1);
      int m = this.g.getInt(3);
      TextView localTextView2 = (TextView)paramView.findViewById(aaw.lK);
      CheckBox localCheckBox = (CheckBox)paramView.findViewById(aaw.df);
      String str5 = 12 + String.valueOf(str4).length() + m + ":" + str4;
      localTextView2.setText(str3);
      localCheckBox.setChecked(this.b.contains(str5));
      paramView.setOnClickListener(new dkw(this, str5));
    }
    label249:
    do
    {
      return paramView;
      if (i == 1)
      {
        localView = this.f.inflate(efj.tq, paramViewGroup, false);
        break;
      }
      if (i == 2)
      {
        localView = this.f.inflate(efj.tn, paramViewGroup, false);
        break;
      }
      localView = this.f.inflate(efj.tr, paramViewGroup, false);
      break;
      if (i == 1)
      {
        String str2 = this.g.getString(2);
        ((TextView)paramView.findViewById(aaw.lK)).setText(str2);
        return paramView;
      }
    } while (i != 2);
    int j = this.g.getInt(1);
    String str1 = this.g.getString(2);
    TextView localTextView1 = (TextView)paramView.findViewById(aaw.lK);
    RadioButton localRadioButton = (RadioButton)paramView.findViewById(aaw.jz);
    localTextView1.setText(str1);
    int k = EsDreamService.a(this.e);
    if ((k != -1) && (k == j)) {}
    for (boolean bool = true;; bool = false)
    {
      localRadioButton.setChecked(bool);
      paramView.setOnClickListener(new dkv(this, localRadioButton, j));
      return paramView;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 4;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return getItemViewType(paramInt) == 0;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dku
 * JD-Core Version:    0.7.0.1
 */