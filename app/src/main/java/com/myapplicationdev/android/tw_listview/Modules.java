package com.myapplicationdev.android.tw_listview;

public class Modules {
    private String moduleCode;
    private boolean isprog;

    public Modules(String moduleCode, boolean isprog) {
        this.moduleCode = moduleCode;
        this.isprog = isprog;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public boolean isIsprog() {
        return isprog;
    }
}
