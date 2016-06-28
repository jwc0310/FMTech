import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;

class md
  extends mc
{
  public void a(LayoutInflater paramLayoutInflater, mh parammh)
  {
    if (parammh != null) {}
    for (mg localmg = new mg(parammh);; localmg = null)
    {
      paramLayoutInflater.setFactory2(localmg);
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if (!(localFactory instanceof LayoutInflater.Factory2)) {
        break;
      }
      aau.a(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      return;
    }
    aau.a(paramLayoutInflater, localmg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     md
 * JD-Core Version:    0.7.0.1
 */