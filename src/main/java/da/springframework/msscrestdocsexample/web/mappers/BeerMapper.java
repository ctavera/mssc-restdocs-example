package da.springframework.msscrestdocsexample.web.mappers;

import da.springframework.msscrestdocsexample.domain.Beer;
import da.springframework.msscrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
