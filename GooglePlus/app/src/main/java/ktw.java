import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class ktw
  implements ktu
{
  ktw(ktr paramktr) {}
  
  public final boolean a(Intent paramIntent)
  {
    return paramIntent.getBooleanExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", false);
  }
  
  public final gxq b(Intent paramIntent)
  {
    ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("com.google.android.libraries.social.notifications.coalescing_codes");
    ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("com.google.android.libraries.social.notifications.ext_ids");
    ArrayList localArrayList3 = paramIntent.getIntegerArrayListExtra("com.google.android.libraries.social.notifications.local_ids");
    ArrayList localArrayList5;
    if ((localArrayList1 == null) && (paramIntent.hasExtra("com.google.android.libraries.social.notifications.notif_id")))
    {
      localArrayList5 = new ArrayList();
      localArrayList5.add(paramIntent.getStringExtra("com.google.android.libraries.social.notifications.notif_id"));
    }
    for (ArrayList localArrayList4 = localArrayList5;; localArrayList4 = localArrayList1)
    {
      if ((localArrayList4 != null) || (localArrayList2 != null)) {
        return new kvh(pjt.d, localArrayList4, localArrayList2);
      }
      if (localArrayList3 != null) {
        return new kvh(pjt.d, localArrayList3);
      }
      return new gxq(pjt.e);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ktw
 * JD-Core Version:    0.7.0.1
 */