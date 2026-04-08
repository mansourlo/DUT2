<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Algorithme de Tri</title>
</head>
<body>
    <h1>Algorithme de Tri</h1>
    <!--TRI SELECTION-->
    <?php 
        function triSelection(array $tab): array{
            for($i=0; $i<count($tab); $i++){
                $min = $i;
                for($j=$i+1; $j<count($tab); $j++){
                    if($tab[$j] < $tab[$min]){
                        $min = $j;
                    }
                }
                if($min !== $i){
                    $temp = $tab[$i];
                    $tab[$i] = $tab[$min];
                    $tab[$min] = $temp;
                }
            }
            return $tab;
        }
    ?>

    <!--TRI BULLES-->
    <?php
        function triBulles(array $tab): array {
            for($i=0; $i<count($tab); $i++){
                for($j=0; $j<count($tab)-1; $j++){
                    if($tab[$j+1] < $tab[$j]){
                        $temp = $tab[$j+1];
                        $tab[$j+1] = $tab[$j];
                        $tab[$j] = $temp;
                    }
                }
            }
            return $tab;
        }
    ?>

    <!--TRI INSERTION-->
    <?php
        function triInsertion(array $tab): array {
            for($i=1; $i<count($tab); $i++){
                $val = $tab[$i];
                $j = $i - 1;
                while($j>=0 && ($tab[$j]>$val)){
                    $tab[$j+1] = $tab[$j];
                    $j = $j - 1;
                }
                $tab[$j+1] = $val;
            }
            return $tab;
        }
    ?>

    <!--TRI RAPIDE-->
    <?php
        function partition(array &$tab, int $low, int $high): int {
           // $high = count($tab) - 1;
            $pivot = $tab[$high];
            $i = $low - 1;

            for($j=$low; $j<$high; $j++){
                if($tab[$j] <= $pivot){
                    $i++;
                    $temp = $tab[$i];
                    $tab[$i] = $tab[$j];
                    $tab[$j] = $temp;
                }
            }
            $temp = $tab[$i+1];
            $tab[$i+1] = $tab[$high];
            $tab[$high] = $temp;

            return $i+1;
        }

        function quickSort(array &$tab, int $low=0, int $high=null){
            if($high === null) {
                $high = count($tab) - 1;
            }

            if($low < $high){
                $p = partition($tab, $low, $high);
                quickSort($tab, $low, $p-1);
                quickSort($tab, $p+1, $high);
            }

            return $tab;
        }
    ?>

    <!--TRI FUSION-->
    <?php
        function mergeSort(array $tab): array {
            if(count($tab) <= 1){
                return $tab;
            }

            $milieu = (int) (count($tab) / 2);
            $left = array_slice($tab, 0, $milieu);
            $right = array_slice($tab, $milieu);

            $left = mergeSort($left);
            $right = mergeSort($right);

            return merge($left, $right);
        }

        function merge(array $left, array $right): array{
            $newTab = [];
            $i = 0; $j = 0;

            while($i<count($left) && $j<count($right)){
                if($left[$i] < $right[$j]){
                    $newTab[] = $left[$i];
                    $i++;
                }else{
                    $newTab[] = $right[$j];
                    $j++;
                }
            }

            while($i < count($left)) {
                $newTab[] = $left[$i];
                $i++;
            }

            while($j < count($right)) {
                $newTab[] = $right[$j];
                $j++;
            }

            return $newTab;
        }
    ?>

    <!--Partie Test-->
    <?php
        $array = array(11,4,62,2,9);

        echo "Affichage avant tri:<br>";
        foreach($array as $num){
            echo $num." | ";
        }

        $array = quickSort($array);

        echo "<hr>Affichage apres tri:<br>";
        foreach($array as $num){
            echo $num." | ";
        }
    ?>
</body>
</html>