package ibf.ssf.day16workshop.model;

import java.util.Date;
import java.util.UUID;

public class Game {

    // PUT IN VALIDATIONS FOR PRACTICE
    
    private String gameId;

    private String homeTeam;

    private String awayTeam;

    private String venue;

    private Date gameDate;

    public Game() {
        // Auto generate unique key for game ID
        // Universally unique identifier
        // 128 bit long number in 36 hex characters
        this.gameId = UUID.randomUUID().toString();
    }

    public Game(String gameId, String homeTeam, String awayTeam, String venue, Date gameDate) {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.venue = venue;
        this.gameDate = gameDate;
    }
    
    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public void setGameDate(Date gameDate) {
        this.gameDate = gameDate;
    }

    

    
}
