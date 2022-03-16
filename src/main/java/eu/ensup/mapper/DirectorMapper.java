package eu.ensup.mapper;

import eu.ensup.business.Director;
import eu.ensup.dto.DirectorDTO;

/**
 * The type Director mapper.
 */
public class DirectorMapper {
    /**
     * Dto to business director.
     *
     * @param directorDTO the director dto
     * @return the director
     */
    public static Director dtoToBusiness(DirectorDTO directorDTO) {
        Director director = new Director();
        director.setFirstname(directorDTO.getFirstname());
        director.setLastname(directorDTO.getLastname());
        director.setAddress(directorDTO.getAddress());
        director.setEmail(directorDTO.getEmail());
        director.setId(directorDTO.getId());
        director.setRole(directorDTO.getRole());
        director.setTelephone(directorDTO.getTelephone());
        director.setUniqueId(directorDTO.getUniqueId());
        return director;
    }

    /**
     * Business to dto director dto.
     *
     * @param director the director
     * @return the director dto
     */
    public static DirectorDTO businessToDto(Director director) {
        DirectorDTO directorDTO = new DirectorDTO();
        directorDTO.setFirstname(director.getFirstname());
        directorDTO.setLastname(director.getLastname());
        directorDTO.setAddress(director.getAddress());
        directorDTO.setEmail(director.getEmail());
        directorDTO.setId(director.getId());
        directorDTO.setRole(director.getRole());
        directorDTO.setTelephone(director.getTelephone());
        directorDTO.setUniqueId(director.getUniqueId());
        return directorDTO;
    }

}
