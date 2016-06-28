import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

final class ixy
{
  final List<rne> a;
  final int b;
  Long[] c;
  String d;
  
  ixy(int paramInt)
  {
    this.b = paramInt;
    this.a = Collections.synchronizedList(new ArrayList(paramInt + 1));
  }
  
  final boolean a(Context paramContext)
  {
    Long[] arrayOfLong = this.c;
    boolean bool = false;
    if (arrayOfLong == null)
    {
      String str1 = this.d;
      bool = false;
      if (str1 != null)
      {
        hyi localhyi = (hyi)mbb.a(paramContext, hyi.class);
        List localList = localhyi.a();
        ArrayList localArrayList1 = new ArrayList();
        int i = localList.size();
        int j = 0;
        String str3;
        for (;;)
        {
          if (j >= i) {
            break label197;
          }
          hyf localhyf = (hyf)localList.get(j);
          String str2;
          if (localhyi.b(localhyf, this.d)) {
            str2 = localhyf.d;
          }
          try
          {
            localArrayList1.add(Long.valueOf(Long.parseLong(str2.toUpperCase(), 16)));
            j++;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            while (!Log.isLoggable("LogSinkImpl", 6)) {}
            str3 = String.valueOf(str2);
            if (str3.length() == 0) {}
          }
        }
        for (String str4 = "Number cannot be parsed from experiment: ".concat(str3);; str4 = new String("Number cannot be parsed from experiment: "))
        {
          Log.e("LogSinkImpl", str4);
          break;
        }
        label197:
        mbj localmbj = new mbj(paramContext, ixq.class);
        ArrayList localArrayList2 = new ArrayList(localmbj.a.keySet());
        for (int k = 0; k < new ArrayList(localmbj.a.keySet()).size(); k++)
        {
          Object localObject = localArrayList2.get(k);
          ixq localixq = (ixq)localmbj.a.get(localObject);
          if (fpf.a(localixq.a, localixq.b, localixq.c)) {
            localArrayList1.add(Long.valueOf(0xFFFFFFFF & localixq.b.substring(13).hashCode()));
          }
        }
        this.c = ((Long[])localArrayList1.toArray(new Long[localArrayList1.size()]));
        bool = true;
      }
    }
    return bool;
  }
  
  final rne[] a()
  {
    return (rne[])this.a.toArray(new rne[this.a.size()]);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixy
 * JD-Core Version:    0.7.0.1
 */