---
toc: true
comments: true
layout: post
title: Song Recommender
courses: { csa: {week: 3} }
type: tangibles
---

<head>
    <title>iTunes Search API</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <h1>iTunes Search API</h1>
    <input type="text" id="search" placeholder="Search">
    <button id="search-button">Search</button>
    <div id="results"></div>
    <script>
        $(document).ready(function() {
            $('#search-button').click(function() {
                var searchTerm = $('#search').val();
                $.ajax({
                    url: 'https://itunes.apple.com/search?term=' + searchTerm,
                    dataType: 'jsonp',
                    success: function(data) {
                        $('#results').text(JSON.stringify(data));
                    }
                });
            });
        });
    </script>
</body>