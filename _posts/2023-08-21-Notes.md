---
toc: false
comments: true
layout: post
title: Lab Notebook
description: Notes for each week of CSA
---

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/showdown@1.9.1/dist/showdown.min.js"></script>

<script>
    const notes = [
        ["-New github pages host!,Create pages by cloning student repo-You have to change a setting to make it build the site on actions,It's important to track your progress and important discoveries in a lab notebook,Good to go early to be graded more favorably", "The new GitHub pages host allows you to create pages by cloning a student repository, but you have to change a setting to build the site on actions. It’s important to track your progress and discoveries in a lab notebook and going early can result in more favorable grading."],
        ["aaa", "Summary"]
    ]

    $(document).ready(function() {
        notes.forEach(function(note) {
            let box = $('<div class="box"></div>');
            let summary = $('<div class="summary"></div>').text(note[1]);
            let noteText = $('<div class="note"></div>').html(note[0].replace(/,/g, "<br>-"));
            let button = $('<button>Show/Hide AI Generated Summary</button>');
            button.click(function() {
                summary.toggle();
            });
            box.append(button);
            box.append(summary);
            box.append('<br>');
            box.append(noteText);
            $('.container').append(box);
            $('.container').append('<br>');
        });
    });
</script>

<div class="container"></div>

<style>
    .box {
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 10px;
        width: 94%;
        padding: 20px;
    }
    .summary {
        display: none;
    }
    button {
        background: #333333;
        color: white;
        font-style: italic;
        outline: none;
        border: none;
        margin: 0px;
    }
</style>