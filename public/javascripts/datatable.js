$(document).ready(function() {
    $('#table_id').DataTable( {
        "order": [[ 1, "desc" ]],
        scrollY:        '50vh',
                scrollCollapse: true,
                paging:         false
    } );
} );