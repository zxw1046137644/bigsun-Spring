package day3;

import global.dao.GlobalDao;

public class day3ServiceImpl implements Day3Service {
    private GlobalDao globalDao;

    /*-*
    注入方式1
     */
    public day3ServiceImpl(GlobalDao globalDao) {
        this.globalDao = globalDao;
    }



    /*-*
       注入方式2
        */
    public void setGlobalDao(GlobalDao globalDao) {
        this.globalDao = globalDao;
    }
    @Override
    public void save() {
        globalDao.saveGlobalDao();
    }
}
