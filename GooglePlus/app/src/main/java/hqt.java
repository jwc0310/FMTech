import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public class hqt
  extends BaseAdapter
{
  private int[] a;
  private int[] b;
  private boolean c = false;
  public ArrayList<Adapter> d = new ArrayList();
  boolean e = false;
  private int f = 0;
  private int g = -1;
  private int[] h;
  private final DataSetObserver i = new hqu(this);
  
  private int a(int paramInt)
  {
    a();
    for (int j = 1; paramInt >= this.b[j]; j++) {}
    if (j > this.d.size()) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return j - 1;
  }
  
  private final void a()
  {
    if (this.e) {
      return;
    }
    this.a = new int[this.d.size()];
    this.f = 0;
    this.b = new int[2 + this.d.size()];
    this.b[0] = 0;
    this.g = 0;
    this.h = new int[1 + this.d.size()];
    this.h[0] = 0;
    for (int j = 0; j < this.d.size(); j++)
    {
      this.a[j] = ((Adapter)this.d.get(j)).getCount();
      this.f += this.a[j];
      this.b[(j + 1)] = (this.b[j] + this.a[j]);
      int k = ((Adapter)this.d.get(j)).getViewTypeCount();
      this.h[(j + 1)] = (k + this.h[j]);
      this.g = (k + this.g);
    }
    this.b[(-1 + this.b.length)] = 2147483647;
    this.e = true;
  }
  
  private int b(int paramInt)
  {
    a();
    int j = a(paramInt);
    return paramInt - this.b[j];
  }
  
  public void a(Adapter paramAdapter)
  {
    if (this.c) {
      throw new IllegalStateException("has been set on ListView");
    }
    paramAdapter.registerDataSetObserver(this.i);
    this.d.add(paramAdapter);
  }
  
  public int getCount()
  {
    a();
    return this.f;
  }
  
  public Object getItem(int paramInt)
  {
    a();
    int j = a(paramInt);
    return ((Adapter)this.d.get(j)).getItem(b(paramInt));
  }
  
  public long getItemId(int paramInt)
  {
    a();
    int j = a(paramInt);
    return ((Adapter)this.d.get(j)).getItemId(b(paramInt));
  }
  
  public int getItemViewType(int paramInt)
  {
    a();
    int j = a(paramInt);
    int k = paramInt - this.b[j];
    return this.h[j] + ((Adapter)this.d.get(j)).getItemViewType(k);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    a();
    int j = a(paramInt);
    return ((Adapter)this.d.get(j)).getView(b(paramInt), paramView, paramViewGroup);
  }
  
  public int getViewTypeCount()
  {
    a();
    this.c = true;
    return this.g;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqt
 * JD-Core Version:    0.7.0.1
 */