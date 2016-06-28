import android.content.Context;
import java.util.Set;

public class mbh
{
  public void a(Context paramContext, mbb parammbb)
  {
    try
    {
      localmbl = (mbl)Class.forName("gen_binder.root.RootModule$Generated").newInstance();
      localSet2 = localmbl.a();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      mbl localmbl;
      throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", localIllegalAccessException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException("Failed to instantiate root module gen_binder.root.RootModule$Generated", localInstantiationException);
    }
    catch (ClassNotFoundException localClassNotFoundException1)
    {
      for (;;)
      {
        label41:
        localSet1 = null;
      }
    }
    try
    {
      parammbb.a(localmbl);
      localmbl.a(parammbb);
      localSet1 = localSet2;
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      localSet1 = localSet2;
      break label41;
    }
    parammbb.a(new mba(paramContext, localSet1));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mbh
 * JD-Core Version:    0.7.0.1
 */