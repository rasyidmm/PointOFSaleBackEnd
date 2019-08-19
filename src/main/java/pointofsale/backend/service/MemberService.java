package pointofsale.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pointofsale.backend.dao.MemberDao;
import pointofsale.backend.factory.RepositoryFac;
import pointofsale.backend.model.MemberModel;

import java.util.ArrayList;
import java.util.List;
@Service
public class MemberService implements MemberDao {
    @Autowired
    RepositoryFac repositoryFac;

    @Override
    public List<MemberModel> getAllMember() {
        List<MemberModel>ml = new ArrayList<>();
        repositoryFac.getMemberRepository().findAll().forEach(ml::add);
        return ml;
    }

    @Override
    public MemberModel getMemberById(Long id) {

        MemberModel ml = repositoryFac.getMemberRepository().findById(id).get();
        return ml;

    }

    @Override
    public void SaveOrUpdateMember(MemberModel a) {
        repositoryFac.getMemberRepository().save(a);

    }

    @Override
    public void UpdateMember(MemberModel a) {
        repositoryFac.getMemberRepository().save(a);
    }

    @Override
    public void deleteMemberById(Long id) {
        repositoryFac.getMemberRepository().deleteById(id);
    }

    @Override
    public void deleteMember(MemberModel a) {
        repositoryFac.getMemberRepository().delete(a);
    }
}
