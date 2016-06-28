public final class kdc
{
  static final la<String, String> a;
  
  static
  {
    String[] arrayOfString1 = { "getmobileexperiments", "registerdevice", "fetchnotifications", "fetchnotificationscount", "getphotossettings", "getsimpleprofile", "getmobilesettings", "loadblockedpeople", "loadpeople", "loadsocialnetwork", "getactivities", "getvolumecontrols", "readcollectionsbyid", "syncuserhighlights", "checkphotosexistence" };
    String[] arrayOfString2 = { "getappupgradestatus", "postclientlogs" };
    a = new la(17);
    int j;
    for (int i = 0;; i++)
    {
      j = 0;
      if (i >= 15) {
        break;
      }
      a.put(arrayOfString1[i], String.valueOf(arrayOfString1[i]).concat("background"));
    }
    while (j < 2)
    {
      a.put(arrayOfString2[j], arrayOfString2[j]);
      j++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdc
 * JD-Core Version:    0.7.0.1
 */