package kr.co.shorturlservice.domain;

import org.springframework.stereotype.Repository;

@Repository
public interface ShortenUrlRepository {
    void saveShortenUrl(ShortenUrl shortenUrl);

    ShortenUrl findShortenUrlByShortenUrlKey(String shortenUrlKey);
}
