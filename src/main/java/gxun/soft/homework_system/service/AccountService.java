//package gxun.soft.homework_system.service;
//
//
//import com.alibaba.fastjson.JSONObject;
//import gxun.soft.homework_system.mapper.AccountMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//import gxun.soft.homework_system.domain.Account;
//import org.springframework.transaction.annotation.Transactional;
//import java.util.ArrayList;
//import java.util.List;
//import gxun.soft.homework_system.utils.W;
//import gxun.soft.homework_system.utils.V;
//import gxun.soft.homework_system.utils.F;
//import gxun.soft.homework_system.utils.bean.Where;
//import gxun.soft.homework_system.utils.bean.Page;
//
//import gxun.soft.homework_system.service.base.TServiceImpl;
//import gxun.soft.homework_system.service.implService.IAccountService;
//
//@Service
//public class AccountService extends TServiceImpl<AccountMapper, Account> implements IAccountService {
//    /**************************CURD begin******************************/
//    // 创建
//
//    @Transactional
//    public Account createAccount(Account model) {
//        if (this.insert(model))
//            return this.selectById(model.getUserId());
//        return null;
//    }
//
//    // 删除
//    @Transactional
//    public Boolean deleteAccount(Object userIds) {
//        return this.delete(userIds);
//    }
//
//    // 修改
//
//    @Transactional
//    public Account updateAccount(Account model) {
//        if (this.update(model))
//            return this.selectById(model.getUserId());
//        return null;
//    }
//
//    // 查询
//    @Transactional
//    public List<Account> findByUserIds(Object userIds) {
//        return this.selectByIds(userIds);
//    }
//
//    public List<Account> findByNumber(Integer userId) {
//        where = W.f(
//                W.and("userId", "eq", userId)
//        );
//
//        List<Account> AccountList = this.query(where);
//        if (AccountList == null || AccountList.size() == 0)
//            return null;
//        return AccountList;
//    }
//
//    // 属于
//    @Override
//    public Boolean exist(List<Where> w) {
//        w.add(new Where("1"));
//        return this.query(w).size() > 0;
//    }
//
//    // 查询一个id是否存在
//    @Override
//    public Boolean existId(Object id) {
//        where = W.f(
//                W.and("userId", id)
//        );
//        return this.query(where).size() > 0;
//    }
//
//    /**************************CURD end********************************/
//    //分页查
//    public Page page(int index, int pageSize, Integer w) {
//        // 总记录数
//        JSONObject row = new JSONObject();
//        if(V.isEmpty(w)){
//            row = baseMapper.getPageCount_default( );
//        }else{
//            row = baseMapper.getPageCount(w);
//        }
//
//
//
//        int totalCount = row.getInteger("total");
//
//        if (totalCount == 0)
//            return new Page(new ArrayList<JSONObject>(), pageSize, 0, 0, 1);
//        // 分页数据
//        index = index < 0 ? 1 : index;
//        int limit = (index - 1) * pageSize;
//        int totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : (totalCount / pageSize) + 1;
//        int currentPage = index;
//
//
//        //只拿了学生数据
//        List<JSONObject> grades = baseMapper.getStudentPage(w, limit, pageSize);
//
//        return new Page(F.f2l(grades, "id"), pageSize, totalCount, totalPage, currentPage);
//    }
//
//    //全查
//    public List<JSONObject> queryAll(Integer where) {
//        List<JSONObject> list = baseMapper.queryAll(where);
//        return F.f2l(list);
//    }
//
//    //根据账号查用户全部信息
//    public JSONObject queryUserByNumber(Integer userId) {
//        JSONObject list = baseMapper.queryUserByUserId(userId);
//        return F.f2j(list);
//    }
//
//    public Boolean existUserId(Integer userId) {
//        where = W.f(
//                W.and("userId", userId)
//        );
//        List<Account> Account = this.query(where);
//        if (Account.size() == 0)
//            return false;
//        return true;
//    }
//
//
//
//
//}