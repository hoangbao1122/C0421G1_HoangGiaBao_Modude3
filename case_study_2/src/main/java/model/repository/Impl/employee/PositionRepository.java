package model.repository.Impl.employee;

import model.bean.employee.Position;
import model.repository.BaseRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPosition {
    private BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Position> listAll() {
        List<Position> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = baseRepository.getConnection().prepareStatement
                    ("select* \n" +
                            "from position");
            ResultSet resultSet = preparedStatement.executeQuery();
            Position position = null;
            while (resultSet.next()){
                position = new Position();
                position.setIdPos(resultSet.getInt("position_id"));
                position.setNamePos(resultSet.getString("position_name"));
                list.add(position);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
