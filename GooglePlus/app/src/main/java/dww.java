import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

final class dww
  extends BaseAdapter
{
  boolean a;
  private Context b;
  
  public dww(dwv paramdwv, Context paramContext, boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b = paramContext;
  }
  
  public final int getCount()
  {
    if (this.a) {
      return 2;
    }
    return 3;
  }
  
  public final Object getItem(int paramInt)
  {
    return Integer.valueOf(paramInt);
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i;
    View localView;
    TextView localTextView;
    Resources localResources;
    Object localObject;
    switch (paramInt)
    {
    default: 
      i = 0;
      localView = null;
      if (localView != null)
      {
        localTextView = (TextView)((TextView)localView.findViewById(aaw.ls)).findViewById(aaw.ls);
        if (localTextView != null)
        {
          localResources = this.c.getContext().getResources();
          localObject = null;
          switch (i)
          {
          }
        }
      }
      break;
    }
    for (;;)
    {
      localTextView.setText((CharSequence)localObject);
      return localView;
      localView = LayoutInflater.from(this.b).inflate(efj.tC, paramViewGroup, false);
      i = 1;
      break;
      if (!this.a)
      {
        localView = LayoutInflater.from(this.b).inflate(efj.tE, paramViewGroup, false);
        i = 6;
        break;
      }
      localView = LayoutInflater.from(this.b).inflate(efj.tF, paramViewGroup, false);
      i = 2;
      break;
      localObject = localResources.getString(aau.gP);
      continue;
      localObject = localResources.getString(aau.gQ);
      continue;
      localObject = localResources.getString(aau.gO);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dww
 * JD-Core Version:    0.7.0.1
 */