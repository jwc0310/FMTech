package com.mpfa.empf.ui.component.drawer;

/**
 * ==================================================================
 * Copyright (C) 2015 Mtelnet All Rights Reserved.
 *
 * @author Drew.Chiang
 * @version v1.0.0
 * @email chiangchuna@gmail.com
 * @create_date 2015/12/29 11:30
 * @description ${todo}
 * <p/>
 * Modification History:
 * Date            Author            Version         Description
 * -----------------------------------------------------------------
 * 2015/12/29 11:30  Drew.Chiang       v1.0.0          create
 * <p/>
 * ==================================================================
 */

public interface DrawerContentClickListener{
    public abstract boolean onDrawActionClicked(FMDrawerLayout.DrawerAction drawerAction);
}
