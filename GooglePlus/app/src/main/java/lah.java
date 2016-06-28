import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

final class lah
  extends ArrayAdapter<Integer>
{
  private final LayoutInflater a;
  
  public lah(laf paramlaf, Context paramContext, int paramInt, Integer[] paramArrayOfInteger)
  {
    super(paramContext, paramInt, paramArrayOfInteger);
    this.a = LayoutInflater.from(paramContext);
  }
  
  private final CharSequence a(int paramInt, boolean paramBoolean)
  {
    boolean bool = this.b.b.isChecked();
    if (!paramBoolean)
    {
      laf locallaf5 = this.b;
      int n = efj.WL;
      return locallaf5.g().getString(n);
    }
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      if (bool)
      {
        laf locallaf4 = this.b;
        int m = efj.WU;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.b.c;
        return locallaf4.g().getString(m, arrayOfObject2);
      }
      laf locallaf3 = this.b;
      int k = efj.WV;
      return locallaf3.g().getString(k);
    }
    if (bool)
    {
      laf locallaf2 = this.b;
      int j = efj.WR;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.b.c;
      return locallaf2.g().getString(j, arrayOfObject1);
    }
    laf locallaf1 = this.b;
    int i = efj.WS;
    return locallaf1.g().getString(i);
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    ViewGroup localViewGroup = (ViewGroup)getView(paramInt, paramView, paramViewGroup);
    ((TextView)localViewGroup.findViewById(aw.dH)).setText(a(paramInt, true));
    localViewGroup.setLayoutParams(laf.a);
    localViewGroup.setPadding(this.b.d, this.b.d, this.b.d, this.b.d);
    return localViewGroup;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (paramView == null) {
      paramView = this.a.inflate(eyg.bE, paramViewGroup, false);
    }
    TextView localTextView = (TextView)paramView.findViewById(aw.dJ);
    boolean bool = this.b.b.isChecked();
    Object localObject;
    switch (paramInt)
    {
    default: 
      localObject = null;
    }
    for (;;)
    {
      localTextView.setText((CharSequence)localObject);
      ((TextView)paramView.findViewById(aw.dH)).setText(a(paramInt, false));
      return paramView;
      if (bool)
      {
        laf locallaf4 = this.b;
        int m = efj.WO;
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = this.b.c;
        localObject = locallaf4.g().getString(m, arrayOfObject2);
      }
      else
      {
        laf locallaf3 = this.b;
        int k = efj.WP;
        localObject = locallaf3.g().getString(k);
        continue;
        if (bool)
        {
          laf locallaf2 = this.b;
          int j = efj.WM;
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.b.c;
          localObject = locallaf2.g().getString(j, arrayOfObject1);
        }
        else
        {
          laf locallaf1 = this.b;
          int i = efj.WN;
          localObject = locallaf1.g().getString(i);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lah
 * JD-Core Version:    0.7.0.1
 */