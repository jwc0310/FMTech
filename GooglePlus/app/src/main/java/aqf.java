import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class aqf
  extends Handler
{
  public aqh a;
  public EnumMap<aqi, aqj> b;
  
  public aqf(Looper paramLooper, aqh paramaqh)
  {
    super(paramLooper);
    this.a = paramaqh;
    this.b = new EnumMap(aqi.class);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    apz localapz;
    do
    {
      return;
      localapz = (apz)paramMessage.obj;
    } while ((this.a == null) || (this.b == null));
    EnumMap localEnumMap = new EnumMap(aqi.class);
    Iterator localIterator = this.b.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localEnumMap.put((Enum)localEntry.getKey(), ((aqj)localEntry.getValue()).a(localapz));
    }
    aqg localaqg = new aqg(this, localEnumMap);
    efj.m().post(localaqg);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aqf
 * JD-Core Version:    0.7.0.1
 */