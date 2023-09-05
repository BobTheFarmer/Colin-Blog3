---
toc: true
comments: true
layout: post
title: Song Recommender
courses: { csa: {week: 3} }
type: tangibles
---

<head>
    <title>iTunes Search API Example</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <!-- Search bar -->
    <input type="text" id="searchBar" placeholder="Search for music..." />
    <button id="searchButton">Search</button>
    <div id="results"></div>
    <script>
        // When the search button is clicked
        $('#searchButton').on('click', function() {
            // Get the value from the search bar
            var searchTerm = $('#searchBar').val();
            // Construct the API request URL
            var url = 'https://itunes.apple.com/search?term=' + encodeURIComponent(searchTerm);
            // Make the API request
            $.getJSON(url, function(data) {
                // Clear any previous results
                $('#results').empty();
                // Loop through the results
                $.each(data.results, function(i, item) {
                    // Build the result item HTML
                    var resultHTML = '<div class="result">';
                    resultHTML += '<img src="' + item.artworkUrl100 + '" />';
                    resultHTML += '<h3>' + item.trackName + '</h3>';
                    resultHTML += '<p>' + item.artistName + '</p>';
                    resultHTML += '</div>';≈
                    // Append the result item to the results container
                    $('#results').append(resultHTML);
                });
            });
        });
    </script>
</body>