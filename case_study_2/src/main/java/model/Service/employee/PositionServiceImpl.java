package model.Service.employee;

import model.bean.employee.Position;
import model.repository.Impl.employee.IPosition;
import model.repository.Impl.employee.PositionRepository;

import java.util.List;

public class PositionServiceImpl  implements IPosition {
    private IPosition iPosition = new PositionRepository();
    @Override
    public List<Position> listAll() {
        return this.iPosition.listAll();
    }
}
