package pointofsale.backend.dao;

import pointofsale.backend.model.MemberModel;

import java.util.List;

public interface MemberDao {
    public List<MemberModel> getAllMember();

    public MemberModel getMemberById(Long id);

    public void SaveOrUpdateMember(MemberModel a);

    public void UpdateMember(MemberModel a);

    public void deleteMemberById(Long id);

    public void deleteMember(MemberModel a);
}

