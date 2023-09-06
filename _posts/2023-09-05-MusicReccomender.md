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
    <style>
        .result {
            display: inline-block;
            background-color: black;
            color: white;
            border-radius: 25px;
            padding: 10px;
            margin: 10px;
            width: 100%;
        }
        .result img {
            vertical-align: middle;
            margin-right: 10px;
        }
    </style>
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
                        $('#results').empty();
                        data.results.forEach(function(result) {
                            var $result = $('<div class="result"></div>');
                            $result.append('<img src="' + result.artworkUrl100 + '">');
                            $result.append('<br> <span>' + result.collectionName + '</span><br>');
                            $result.append('<span>' + result.artistName + '</span><br>');
                            $result.append('<button id="find-similar">Find Similar Results</button>');
                            $('#results').append($result);
                        });
                    }
                });
            });
        });
    </script>
</body>