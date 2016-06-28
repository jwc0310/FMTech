final class jkr
  implements iuu
{
  private static final int a = qwt.a.b >>> 3;
  private static final int b = qwu.a.b >>> 3;
  
  public final void a(gjb paramgjb, kcx paramkcx)
  {
    qao localqao1 = qwt.a;
    int i = a;
    paramkcx.a(kcx.a(localqao1), null, i);
    qao localqao2 = qwu.a;
    int j = b;
    paramkcx.a(kcx.a(localqao2), null, j);
  }
  
  public final void a(gje paramgje, kcx paramkcx)
  {
    int i = paramkcx.a(a);
    int j = paramkcx.a(b);
    qwt localqwt = (qwt)paramkcx.a(i, qwt.a);
    qwu localqwu = (qwu)paramkcx.a(j, qwu.a);
    if (efj.b(localqwt.b))
    {
      paramgje.c("add_circle_notice_shown", true);
      paramgje.c("add_circle_notice_one_time_sync", true);
    }
    if (efj.b(localqwu.b))
    {
      paramgje.c("one_click_add_circle_notice_shown", true);
      paramgje.c("one_click_add_circle_notice_one_time_sync", true);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jkr
 * JD-Core Version:    0.7.0.1
 */