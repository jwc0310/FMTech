import android.database.DataSetObserver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

final class doc
  implements ListAdapter
{
  doc(dob paramdob) {}
  
  public final boolean areAllItemsEnabled()
  {
    return true;
  }
  
  public final int getCount()
  {
    return this.a.b.length;
  }
  
  public final Object getItem(int paramInt)
  {
    return this.a.c[paramInt];
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.a.g.inflate(efj.ws, paramViewGroup, false);
    }
    ((TextView)paramView.findViewById(16908308)).setText(this.a.b[paramInt]);
    TextView localTextView = (TextView)paramView.findViewById(16908309);
    CharSequence localCharSequence = this.a.d[paramInt];
    if (TextUtils.isEmpty(localCharSequence)) {
      localTextView.setVisibility(8);
    }
    for (;;)
    {
      RadioButton localRadioButton = (RadioButton)paramView.findViewById(aaw.in);
      int i = this.a.f;
      boolean bool = false;
      if (paramInt == i) {
        bool = true;
      }
      localRadioButton.setChecked(bool);
      return paramView;
      localTextView.setVisibility(0);
      localTextView.setText(localCharSequence);
    }
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    return true;
  }
  
  public final boolean isEmpty()
  {
    return this.a.b.length == 0;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    return true;
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {}
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     doc
 * JD-Core Version:    0.7.0.1
 */